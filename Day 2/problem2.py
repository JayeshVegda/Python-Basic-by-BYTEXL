## Print week day by number


    try: 
        day = int(input("-> Enter the day : "))
        match day:
            case 1:
                print("Monday")
            case 2:
                print("Tuesday")
            case 3:
                print("Wensday")
            case 4:
                print("Thrusday")
            case 5:
                print("Friday")
            case 6:
                print("Satureday")
            case 7:
                print("Sunday")
            
            case _:
                print("Invalid Day")
    except:
        print("Invalid Option")
        status = True